SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.14"

RPM_NAME = "python313-num2words-0.5.14-1.5.noarch.rpm"
RPM_HASH = "a7eb0ac6051f88d337e8066eef92e48244f9a788d1a861cb691aa23ebc7628aadbe6f184151f32aae359c4dbadd2ffd99d2952828e9794e29c603c5c5e083157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-num2words \
python3.13dist-num2words \
python313-num2words \
python3dist-num2words"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docopt"

inherit rpm
