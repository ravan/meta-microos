SUMMARY = "A framework for modelling build pipelines in YAML"
DESCRIPTION = "BuildStream is a flexible and extensible framework for the modelling of \
build and CI pipelines in a declarative YAML format, written in python."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.0"

RPM_NAME = "buildstream-2.8.0-1.1.aarch64.rpm"
RPM_HASH = "59bd9ba6fe0f57429f46d827183a65f6276d85b09463fc967b475ad6e79953ee2a18aee1f9b8f4c1c290e5b717e6270bcb1603031f54bff0aadb32c45511134a"

RPROVIDES:${PN} += "buildstream \
python3.13dist-buildstream \
python3dist-buildstream"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
bubblewrap \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Jinja2 \
python3-base \
python3-click \
python3-gobject \
python3-grpcio \
python3-pluginbase \
python3-protobuf \
python3-psutil \
python3-ruamel.yaml \
python3-ruamel.yaml.clib \
python3-setuptools \
python3-ujson \
typelib-1-0-OSTree-1-0"

inherit rpm
