SUMMARY = "Prometheus Utility Tool"
DESCRIPTION = "The Prometheus Utility Tool is used by the Prometheus project to build other components."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "golang-github-prometheus-promu-0.20.0-1.3.aarch64.rpm"
RPM_HASH = "2fabae0543439e62c1ac11ddc1d75e2ff32e6267133911ccc89b49856f718e14eec97902ae5e772ac61ab85cde6e8da4b2361a4298e81738c30a4e030803823f"

RPROVIDES:${PN} += "golang-github-prometheus-promu"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
