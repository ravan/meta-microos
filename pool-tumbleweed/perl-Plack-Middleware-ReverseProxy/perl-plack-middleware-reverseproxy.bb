SUMMARY = "Supports app to run as a reverse proxy backend"
DESCRIPTION = "Plack::Middleware::ReverseProxy resets some HTTP headers, which changed by \
reverse-proxy. You can specify the reverse proxy address and stop fake \
requests using 'enable_if' directive in your app.psgi."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Plack-Middleware-ReverseProxy-0.16-1.24.noarch.rpm"
RPM_HASH = "174e46309a020e20456078b879a81b2ea8637ad6ea550001784e12e65b10574d2b73efffeab79c4ecbbe30139bd3e588b8188670c724c69ad17663af58e34ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--ReverseProxy \
perl-Plack-Middleware-ReverseProxy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Plack \
perl-Plack--Middleware \
perl-Plack--Request \
perl-parent"

inherit rpm
