SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.24"

RPM_NAME = "python313-Flask-Compress-1.24-1.2.noarch.rpm"
RPM_HASH = "37a0dda95a847bcddb95aa3a772778251d0ca7c9de9d1b772e4bd0adc223902db7e194337afe9201e8b9fc7b6e12d5aa3535c526e69b0022475937f7b12e53c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Compress \
python3.13dist-flask-compress \
python313-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python313-Brotli \
python313-Flask \
python313-backports.zstd"

inherit rpm
