SUMMARY = "OpenAPI / Swagger plugin for Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::OpenAPI is Mojolicious::Plugin that add routes and \
input/output validation to your Mojolicious application based on a OpenAPI \
(Swagger) specification. This plugin supports both version 2.0 and 3.x, \
though 3.x _might_ have some missing features. \
 \
Have a look at the SEE ALSO for references to plugins and other useful \
documentation. \
 \
Please report in at https://github.com/jhthorsen/json-validator/issues or \
open pull requests to enhance the 3.0 support."
LICENSE = "Artistic-2.0"

PV = "5.120.0"

RPM_NAME = "perl-Mojolicious-Plugin-OpenAPI-5.120.0-1.3.noarch.rpm"
RPM_HASH = "defa9fe42d2f299a0175f8dfeab8eb068415da922a35d81d62ba9ba07a153d4f09d0fdfa83816db58de992c8975029da63515118997cd140d96d9b07f3106e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--OpenAPI \
perl-Mojolicious--Plugin--OpenAPI--Cors \
perl-Mojolicious--Plugin--OpenAPI--Parameters \
perl-Mojolicious--Plugin--OpenAPI--Security \
perl-Mojolicious--Plugin--OpenAPI--SpecRenderer \
perl-Mojolicious-Plugin-OpenAPI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--Validator \
perl-Mojolicious"

inherit rpm
