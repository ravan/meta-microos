SUMMARY = "A manga reader for GNOME"
DESCRIPTION = "Komikku is a manga reader for GNOME. It focuses on providing a clean, intuitive \
and adaptive interface. \
 \
Keys features \
* Online reading from dozens of servers \
* Offline reading of downloaded comics \
* Categories to organize your library \
* RTL, LTR, Vertical and Webtoon reading modes \
* Several types of navigation: \
  * Keyboard arrow keys \
  * Right and left navigation layout via mouse click or tapping \
    (touchpad/touch screen) \
  * Mouse wheel \
  * 2-fingers swipe gesture (touchpad) \
  * Swipe gesture (touch screen) \
* Automatic update of comics \
* Automatic download of new chapters \
* Reading history \
* Light and dark themes"
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later"

PV = "50.15.0"

RPM_NAME = "Komikku-50.15.0-1.1.noarch.rpm"
RPM_HASH = "aaee1dc4c8efa9f33e868410be0fe184bb338c86380c706040a3cede1b388892f1d9d9813143f000af2718c633993dbe44aee7f72732882dce86e895743405ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Komikku"

RDEPENDS:${PN} += "/usr/bin/python3 \
WebKitGTK-6.0 \
python-abi \
python3-Brotli \
python3-Pillow \
python3-PyJWT \
python3-Unidecode \
python3-beautifulsoup4 \
python3-cffi \
python3-cloudscraper \
python3-cryptography \
python3-dateparser \
python3-ebooklib \
python3-emoji \
python3-gobject \
python3-jxlpy \
python3-keyring \
python3-lxml \
python3-modern-colorthief \
python3-natsort \
python3-piexif \
python3-pillow-jxl-plugin \
python3-pure-protobuf \
python3-pycairo \
python3-pypdf \
python3-python-magic \
python3-pytz \
python3-rarfile \
python3-regex \
python3-requests \
python3-setuptools-gettext \
python3-typing-extensions \
python3-tzlocal \
python3-urllib3 \
python3-wheel \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-Soup \
typelib-WebKit \
unrar-wrapper"

inherit rpm
