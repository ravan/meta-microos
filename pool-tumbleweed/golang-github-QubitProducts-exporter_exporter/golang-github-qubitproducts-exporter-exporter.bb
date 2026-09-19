SUMMARY = "Reverse proxy designed for Prometheus exporters"
DESCRIPTION = "Reverse proxy designed for Prometheus exporters"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "golang-github-QubitProducts-exporter_exporter-0.4.0-16.4.aarch64.rpm"
RPM_HASH = "80c560a92c681ef490690f4ad618c000aa59ae59a8376563d2a816498eea4ede1c2110d81f4a109d8bb3d14a7c0492b4068cea645cadf41e5c59cc7c870a76b2"

RPROVIDES:${PN} += "config-golang-github-QubitProducts-exporter-exporter \
golang-github-QubitProducts-exporter-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
shadow"

inherit rpm
