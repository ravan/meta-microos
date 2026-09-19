SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python313-scour-0.38.2-3.5.noarch.rpm"
RPM_HASH = "94a45ad4270c9346a169db70349b1ebbe6466b143a1b84f51aa12b3e01427be8876629b9beebc084b8355bcab229fd22de947f5eac71a6d6579b3cbe30d5e64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scour \
python3.13dist-scour \
python313-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
