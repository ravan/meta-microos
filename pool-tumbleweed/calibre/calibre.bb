SUMMARY = "EBook Management Application"
DESCRIPTION = "Calibre is an ebook library manager. It can view, convert and catalog \
ebooks in most of the major ebook formats. It can also talk to a few \
ebook reader devices. It can go out on the Internet and fetch \
metadata for books. It can download newspapers and convert them \
into ebooks for convenient reading."
LICENSE = "GPL-3.0-only"

PV = "9.14.0"

RPM_NAME = "calibre-9.14.0-1.1.aarch64.rpm"
RPM_HASH = "2a72c1c1d942cf6b57990fd239b14ccf7377a408d4e7bcb5e18612b0256bd0178db0c94079770f1594333bc098b06dd675debf162dddd688d728d5bccdec1cf0"

RPROVIDES:${PN} += "calibre \
libheadless.so \
libmtp.so \
libusb.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
bzip2 \
chmlib \
expat \
findutils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcrypto.so.3 \
liberation-fonts \
libfreetype.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libhyphen.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg-turbo \
libm.so.6 \
libmtp.so.9 \
libmtp9 \
libpng16-16 \
libpodofo.so.2 \
libpython3.14.so.1.0 \
libsqlite3-0 \
libstdc++.so.6 \
libstemmer.so.0d \
libswresample.so.6 \
libuchardet.so.0 \
libusb-1.0.so.0 \
libwmf \
optipng \
poppler-tools \
python-abi \
python314-Brotli \
python314-Deprecated \
python314-FontTools \
python314-Markdown \
python314-Pillow \
python314-PyQt6 \
python314-PyQt6-WebEngine \
python314-PyQt6-sip \
python314-Pygments \
python314-apsw \
python314-base \
python314-beautifulsoup4 \
python314-chardet \
python314-css-parser \
python314-dateutil \
python314-dnspython \
python314-feedparser \
python314-feedparser-sgmllib \
python314-html2text \
python314-html5-parser \
python314-html5lib \
python314-ifaddr \
python314-inflate64 \
python314-jaconv \
python314-jeepney \
python314-lxml \
python314-lxml-html-clean \
python314-mechanize \
python314-msgpack \
python314-multivolumefile \
python314-netifaces \
python314-psutil \
python314-py7zr \
python314-pybcj \
python314-pychm \
python314-pycryptodome \
python314-pyppmd \
python314-pystache \
python314-qt6 \
python314-qtwebengine-qt6 \
python314-regex \
python314-sgmllib3k \
python314-six \
python314-soupsieve \
python314-texttable \
python314-typing-extensions \
python314-tzdata \
python314-tzlocal \
python314-webencodings \
python314-wrapt \
python314-xxhash \
python314-zeroconf \
sqlite3 \
unrar \
xdg-utils \
xz \
zlib \
zstd"

inherit rpm
