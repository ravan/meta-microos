SUMMARY = "A tool that simplifies the management of multiple versions of kubectl"
DESCRIPTION = "kuberlr (kube-ruler) is a simple wrapper for kubectl. Its main purpose is to \
make it easy to manage clusters running different versions of kubernetes."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "kuberlr-0.6.1-1.7.aarch64.rpm"
RPM_HASH = "5742f1ddd5d50a295773cbf0dfce4b528092bdfd04bb04e35dfa9e849415504b25ed1ab431c250f06db02cc811e613421fed89ddc3a544a54e1b7e07c4fd424c"

RPROVIDES:${PN} += "kuberlr \
kubernetes-client-provider"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
update-alternatives"

inherit rpm
