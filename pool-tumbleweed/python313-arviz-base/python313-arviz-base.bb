SUMMARY = "Base ArviZ features and converters"
DESCRIPTION = "Base ArviZ features and converters."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-arviz-base-1.3.0-1.1.noarch.rpm"
RPM_HASH = "2bff703e38d70106b7ab48aca4288cb17f63cd476918d9ec5869b892e796e3aabcb4e223c71377996d89e268df07ff56431906e10e77be8194b5cb1406a692a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz-base \
python3.13dist-arviz-base \
python313-arviz-base \
python3dist-arviz-base"

RDEPENDS:${PN} += "python-abi \
python313-lazy-loader \
python313-numpy \
python313-typing-extensions \
python313-xarray"

inherit rpm
