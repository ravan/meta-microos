SUMMARY = "Plugin API for python"
DESCRIPTION = "This package contains the sudo plugin which allows to write sudo plugins \
in python. The API closely follows the C sudo plugin API described by \
sudo_plugin(5)."
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-plugin-python-1.9.17p2-4.1.aarch64.rpm"
RPM_HASH = "02cba4ab2cc9c950db19d9464e590ca37cda11b52c00893756700eb0f78e2609f3f6ce76560c4664d6bd211aea045023a9c14a1cd270f0559d2231146947b222"

RPROVIDES:${PN} += "sudo-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
libsudo-util.so.0 \
sudo"

inherit rpm
