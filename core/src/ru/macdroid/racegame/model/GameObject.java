package ru.macdroid.racegame.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

abstract class GameObject {

    Rectangle bounds; //  ограничивающаяя рамка объекта
    Sprite object;

    GameObject(Texture texture, float x, float y, float width, float height) {
        bounds = new Rectangle(x, y, width, height);
        object = new Sprite(texture); // новый спрайт на основе текстуры
    }

    public void draw(SpriteBatch batch) {
        object.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        object.draw(batch);
    }

}
