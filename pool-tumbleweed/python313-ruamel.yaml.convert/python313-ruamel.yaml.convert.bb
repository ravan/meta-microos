SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Data format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python313-ruamel.yaml.convert-0.3.2-3.4.noarch.rpm"
RPM_HASH = "556cc46df62cac49ef0a1cf01b2fb5c62262d768b7d44d151c08284cd09a588619997ce1a6d16cf77f14dca704cdca8818b28f69a026214a2eb742e36b65d1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml.convert \
python3.13dist-ruamel.yaml.convert \
python313-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-ruamel.base \
python313-ruamel.yaml"

inherit rpm
