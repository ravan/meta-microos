SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python313-jinja2-pluralize-0.3.0-3.5.noarch.rpm"
RPM_HASH = "6f6ad4cb479f23e08b973600ce2eca0a1f5bcd155fe68c52cace8e16958f5db4ff2cd7729654b9dfb4b42d66259d8db34156c1f1d06522e5fa9fb163fbf8f91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-pluralize \
python3.13dist-jinja2-pluralize \
python313-jinja2-pluralize \
python3dist-jinja2-pluralize"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-inflect"

inherit rpm
