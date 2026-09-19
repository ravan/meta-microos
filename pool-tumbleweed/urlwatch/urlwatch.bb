SUMMARY = "A tool for monitoring webpages for updates"
DESCRIPTION = "urlwatch is intended to help you watch changes in webpages and get \
notified (via email, in your terminal or with a custom-written \
reporter class) of any changes. The change notification will include \
the URL that has changed and a unified diff of what has changed. \
 \
A default config is ~/.urlwatch/urlwatch.yaml. \
use 'urlwatch --edit-config' to customize it. \
 \
You need to create ~/.urlwatch/urls.yaml in order to use urlwatch. \
Use 'urlwatch --edit' to open the file with your editor. \
 \
Please look in \
 \
 /usr/share/doc/packages/urlwatch/README.md \
 \
 TIPS AND TRICKS what to use in urls.yaml."
LICENSE = "BSD-3-Clause"

PV = "2.29"

RPM_NAME = "urlwatch-2.29-2.4.noarch.rpm"
RPM_HASH = "7ca551854f49eee478058f4dfb7a2f0d6e8499c858cbff25b473ae3696e2aa24035b5b2fe642cfbcf4cc55f1a83b28613ec77e6ccabf5db1f34cf6cbd3a61384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-urlwatch \
python3dist-urlwatch \
urlwatch"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-cssselect \
python3-keyring \
python3-lxml \
python3-minidb \
python3-platformdirs \
python3-requests"

inherit rpm
