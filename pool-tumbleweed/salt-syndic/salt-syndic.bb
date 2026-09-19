SUMMARY = "The syndic component for saltstack"
DESCRIPTION = "Salt syndic is the master-of-masters for salt \
The master of masters for salt-- it enables \
the management of multiple masters at a time.."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-syndic-3006.0-70.1.aarch64.rpm"
RPM_HASH = "5d78e9c5ec55af0d9db4422c3d04af1764f33ae3f381cec913e11521f5dd4fb387c0829438ace2dafea4077f4b8d81b0e2fd43c9c96a30572634ebd1fc3c487e"

RPROVIDES:${PN} += "salt-syndic"

RDEPENDS:${PN} += "/usr/bin/sh \
salt \
salt-master \
systemd"

inherit rpm
