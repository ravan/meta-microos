SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "python314-django-webpack-loader-3.2.4-1.1.noarch.rpm"
RPM_HASH = "1dad5ca2130069bef2c1f6b7b0050abd9b996f67661e8f24b7098ec77ca3d2025475bf6d4e19d65967cf18eba1542e69e3ee05326ef11f0fceee65da9c1ba83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-webpack-loader \
python314-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
