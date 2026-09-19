SUMMARY = "XMPP client written in Python and GTK"
DESCRIPTION = "Gajim is a Jabber/XMPP client. It works with MATE and GNOME, but does \
require neither to run. \
 \
Features: \
 * Tabbed chat window and single window modes. \
 * Group chat support (with Multi-User Chat protocol), invitation, \
   chat to group chat transformation, minimise group chat to roster. \
 * Emoticons, avatars, PEP (user activity, mood and tune). \
 * Audio / video conferences. \
 * File transfer, room bookmarks. \
 * Metacontacts support. \
 * Trayicon, speller, extended chat history functionalities. \
 * TLS, GPG and End-To-End encryption support (with SSL legacy support). \
 * Transport registration support. \
 * Service discovery including nodes, user search. \
 * Wikipedia, dictionary and search engine lookup. \
 * Multiple accounts support. \
 * DBus capabilities. Read more information. \
 * XML console. \
 * Link local (bonjour / zeroconf), BOSH. \
 * Other features via plugins."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "gajim-2.4.6-1.2.noarch.rpm"
RPM_HASH = "66b1b8eccd10591ad88e76e7e1cf3b0cdd64586ac535a910348ad6fe73583f34439addee6ca592a6393b59aa568906944f87a04d55683591641490a8774752f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim \
python3.13dist-gajim \
python3dist-gajim"

RDEPENDS:${PN} += "-python3.13dist(nbxmpp) < 8 with python3.13dist(nbxmpp) >= 7.2 \
-python3.13dist(omemo-dr) < 2 with python3.13dist(omemo-dr) >= 1.2 \
/usr/bin/python3.13 \
ca-certificates-mozilla \
python-abi \
python3-base \
python3.13dist-cryptography \
python3.13dist-css-parser \
python3.13dist-emoji \
python3.13dist-httpx \
python3.13dist-keyring \
python3.13dist-packaging \
python3.13dist-pillow \
python3.13dist-precis-i18n \
python3.13dist-pycairo \
python3.13dist-pygobject \
python3.13dist-qrcode \
python3.13dist-sqlalchemy \
python3.13dist-truststore \
python313-Pillow \
python313-SQLAlchemy \
python313-cryptography \
python313-css-parser \
python313-emoji \
python313-gobject-Gdk \
python313-gobject-cairo \
python313-gssapi \
python313-httpx \
python313-keyring \
python313-nbxmpp \
python313-omemo-dr \
python313-packaging \
python313-precis-i18n \
python313-qrcode \
python313-truststore \
sqlite3 \
typelib-Adw \
typelib-Farstream \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Geoclue \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-Spelling"

inherit rpm
