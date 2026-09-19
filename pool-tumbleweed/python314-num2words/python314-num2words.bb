SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.14"

RPM_NAME = "python314-num2words-0.5.14-1.5.noarch.rpm"
RPM_HASH = "bd2d56946fc52438b00b74759026aa55b84e7e9c77b8541950d74125b668185d3c59056f1ea412e0951e72c7565b2bde0ed63e46de5a4e9f96793c441b879ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-num2words \
python314-num2words \
python3dist-num2words"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docopt"

inherit rpm
