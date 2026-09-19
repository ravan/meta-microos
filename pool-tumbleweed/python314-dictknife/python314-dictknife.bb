SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python314-dictknife-0.14.2-1.5.noarch.rpm"
RPM_HASH = "529f4da59b89854df0df97a0d28b8bb01031747909d3f6d4f7957a98be5286623d0d50966dac0065e6b384c1f4a03769754d120988ef50e5eafe4e018511f90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dictknife \
python314-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
