SUMMARY = "YaST2 - Scanner Configuration"
DESCRIPTION = "This package provides support for the configuration of USB scanners, \
SCSI scanners, scanners in HP all-in-one devices, and scanning via \
network (i.e. use a remote scanner via another host in the network). \
 \
Parallel port scanners and network scanners (i.e. a scanner which is \
directly accessible in the network) cannot be configured with this \
tool, except for such scanners in HP all-in-one devices. Usually those \
devices must be configured manually. For more information see \
http://www.sane-project.org/ and the documentation in the package \
'sane-backends'."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-scanner-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "05253c1e07afae929d009271c44bd74f8a65ad34d9213702db01691adafc3110ced647819fd5983f6030ac7072c1b11a3fbc306592112db2bb72822a25f979ec"

RPROVIDES:${PN} += "yast2-scanner"

RDEPENDS:${PN} += "/usr/bin/bash \
libX11.so.6 \
libc.so.6 \
yast2 \
yast2-ruby-bindings"

inherit rpm
