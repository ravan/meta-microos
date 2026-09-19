SUMMARY = "NGINX echo module"
DESCRIPTION = "Brings 'echo', 'sleep', 'time', 'exec' and more shell-style goodies to Nginx config file."
LICENSE = "BSD-2-Clause"

PV = "0.64"

RPM_NAME = "nginx-module-echo-0.64-1.10.aarch64.rpm"
RPM_HASH = "c7df1c530569b6a867cbfad135db8638971806b3f0fb4d3ab4558a299214bf33d76605a3b46adc76aa32e75b1478d9d274a15af6499b2cafe736b89847565d18"

RPROVIDES:${PN} += "nginx-module-echo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
