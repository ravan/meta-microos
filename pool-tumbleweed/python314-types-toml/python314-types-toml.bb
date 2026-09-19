SUMMARY = "Typing stubs for toml"
DESCRIPTION = "Typing stubs for toml."
LICENSE = "Apache-2.0"

PV = "0.10.8.20240310"

RPM_NAME = "python314-types-toml-0.10.8.20240310-1.9.noarch.rpm"
RPM_HASH = "ae0413fce3ecf365c76cddcdee032fd397732efe9547fc4c590d3d5051c98bc0291ca7a0690b53640c0d0265a2100b8ab0ff68fbf341eb787bb1f7d0e9d62579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-toml \
python314-types-toml \
python3dist-types-toml"

RDEPENDS:${PN} += ""

inherit rpm
