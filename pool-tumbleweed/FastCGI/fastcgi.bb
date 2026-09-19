SUMMARY = "A Scalable, Open Extension to CGI"
DESCRIPTION = "FastCGI is a language-independent, scalable, open extension to CGI that \
provides high performance without the limitations of server-specific \
APIs."
LICENSE = "OML"

PV = "2.4.7"

RPM_NAME = "FastCGI-2.4.7-1.7.aarch64.rpm"
RPM_HASH = "d7a4bd5b2e9673bc184cabaeb72f5dac4057da4a3300f6dfad6acdb6410eff4e49af907273d321428046c31705305ba4b856336778a3e55210322ad28780f158"

RPROVIDES:${PN} += "FastCGI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0"

inherit rpm
