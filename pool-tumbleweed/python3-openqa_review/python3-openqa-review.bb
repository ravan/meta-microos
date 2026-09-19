SUMMARY = "A review helper script for openQA"
DESCRIPTION = "A review helper script for openQA. For more details look into the README file."
LICENSE = "MIT"

PV = "1.40.0"

RPM_NAME = "python3-openqa_review-1.40.0-1.4.noarch.rpm"
RPM_HASH = "62aab60f859eeb190acb91dcded214fee0a0bc29cd3b87cee7f9c803320aa370b79a1c28c4933929bf0de0f7480babfab78b58cac52ce536e8d8374e0eab85cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa-review \
python3.13dist-openqa-review \
python3dist-openqa-review"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-PyYAML \
python3-beautifulsoup4 \
python3-certifi \
python3-humanfriendly \
python3-pika \
python3-requests \
python3-setuptools \
python3-sortedcontainers \
update-alternatives"

inherit rpm
