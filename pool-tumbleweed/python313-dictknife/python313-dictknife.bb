SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python313-dictknife-0.14.2-1.5.noarch.rpm"
RPM_HASH = "4029955b2b2dcc0f5a3f610d24c302a568df097780a00423ca8091f55553b2faf60d5b7bac8f123a748ce404697c7649be0cfd8d316f61f821f96f470b309609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictknife \
python3.13dist-dictknife \
python313-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
