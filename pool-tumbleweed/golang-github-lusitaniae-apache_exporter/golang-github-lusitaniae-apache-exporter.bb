SUMMARY = "Apache Exporter for Prometheus"
DESCRIPTION = "Exports apache mod_status statistics via HTTP for Prometheus consumption."
LICENSE = "MIT"

PV = "1.0.10"

RPM_NAME = "golang-github-lusitaniae-apache_exporter-1.0.10-3.7.aarch64.rpm"
RPM_HASH = "f6aadc1af248cf1e24734e2bfa5d64848a4b3e33d59bf4cc399d089cecb7cbc6bc8d7efcd65bc3f1896cdaf3afd841fb4be2c1b22f06db23b659d1a839c5b4d8"

RPROVIDES:${PN} += "golang-github-lusitaniae-apache-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
