SUMMARY = "KIWI - host requirements for OCI container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build OCI container images"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-containers-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "713715b588cb35d9e6be115715eaafb818130ffc6b5f260e31adce4a7c7ab3ed4dd495995f81dcaeaf924b2814440e4a5b63ccc97ae0e02458525e72345c7f5f"

RPROVIDES:${PN} += "kiwi-image-docker \
kiwi-image-docker-requires \
kiwi-image-oci \
kiwi-systemdeps-containers"

RDEPENDS:${PN} += "skopeo \
umoci"

inherit rpm
