SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.24"

RPM_NAME = "python314-Flask-Compress-1.24-1.2.noarch.rpm"
RPM_HASH = "1ef0bd61aa089c1701923a13bb97a76862fa18dc57ce6d779a774b5d61ff6af594d0ca065d1a00eae25ad6beea3ff7f5d7cf83d0272f4ed7db1b3b51cdad10b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-compress \
python314-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python314-Brotli \
python314-Flask"

inherit rpm
