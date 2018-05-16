/**
 *  Copyright (C) 2002-2015   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.option;

import javax.xml.stream.XMLStreamException;

import net.sf.freecol.common.ObjectWithId;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;

<<<<<<< HEAD

// TODO: Auto-generated Javadoc
/**
 * An option describes something which can be customized by the user.
 *
 * @param <T> the generic type
=======
/**
 * An option describes something which can be customized by the user.
 *
 * @param <T>
 *            the generic type
>>>>>>> master
 * @see net.sf.freecol.common.model.GameOptions
 */
public interface Option<T> extends Cloneable, ObjectWithId {

<<<<<<< HEAD
    /**
     * Clone this option.
     *
     * @return A clone of this option.
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public Option<T> clone() throws CloneNotSupportedException;
=======
	/**
	 * Clone this option.
	 *
	 * @return A clone of this option.
	 * @throws CloneNotSupportedException
	 *             the clone not supported exception
	 */
	public Option<T> clone() throws CloneNotSupportedException;
>>>>>>> master

	/**
	 * Gets the value of this option.
	 *
	 * @return The value of this <code>Option</code>.
	 */
	public T getValue();

	/**
	 * Sets the value of this option.
	 *
	 * @param value
	 *            The new value of this <code>Option</code>.
	 */
	public void setValue(T value);

	/**
	 * Initializes this object from an XML-representation of this object.
	 *
	 * @param xr
	 *            The input stream with the XML.
	 * @throws XMLStreamException
	 *             if there are any problems reading the stream.
	 */
	public void readFromXML(FreeColXMLReader xr) throws XMLStreamException;

	/**
	 * Makes an XML-representation of this object.
	 *
	 * @param xw
	 *            The <code>FreeColXMLWriter</code> to write to.
	 * @throws XMLStreamException
	 *             if there are any problems writing the stream.
	 */
	public void toXML(FreeColXMLWriter xw) throws XMLStreamException;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString();
}
