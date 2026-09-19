SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python313-titlecase-2.4.1-2.5.noarch.rpm"
RPM_HASH = "2b9cef7cf566190f8db88c3920db6c756142a57cae5ebb0782467c95c70b442dce4e998f32cdad72cb1ee7e6f2c00711d803a1bf11b4830bcbd06dd3b0b6dfea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-titlecase \
python3.13dist-titlecase \
python313-titlecase \
python3dist-titlecase"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-regex \
update-alternatives"

inherit rpm
