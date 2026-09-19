SUMMARY = "simple HTTP router"
DESCRIPTION = "Router::Simple is a simple router class. \
 \
Its main purpose is to serve as a dispatcher for web applications. \
 \
Router::Simple can match against PSGI '$env' directly, which means it's \
easy to use with PSGI supporting web frameworks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Router-Simple-0.17-1.40.noarch.rpm"
RPM_HASH = "ba3d9fdd91cb289eddf5f4319049335472d50b379876e01bda849de137dd6a816fafe4dd066d33e07d795f06317037300c7e798f86925c0dd8f3a9665ad12155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Router--Simple \
perl-Router--Simple--Declare \
perl-Router--Simple--Route \
perl-Router--Simple--SubMapper \
perl-Router-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Lite \
perl-parent"

inherit rpm
