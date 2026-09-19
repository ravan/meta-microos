SUMMARY = "Generate spec files from Jinja2 templates"
DESCRIPTION = "renderspec is a tool to convert a .spec.j2 Jinja2 template to \
a rpm .spec file which is usable for different distributions \
and follow their policies and processes."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "python3-renderspec-2.3.0-1.8.noarch.rpm"
RPM_HASH = "7bc36aa037df16d696632a96d1200b6785c129a45ac84cbaac2d85832c3c8b39d2997a66cf73c0c801cd130778098284d0964b4f73cc936abcc837f2e6950f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-renderspec \
python3.13dist-renderspec \
python3dist-renderspec"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-packaging \
python3-pymod2pkg"

inherit rpm
