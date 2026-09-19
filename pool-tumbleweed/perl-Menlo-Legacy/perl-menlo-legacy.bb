SUMMARY = "Legacy internal and client support for Menlo"
DESCRIPTION = "Menlo::Legacy is a package to install Menlo::CLI::Compat which is a \
compatibility library that implements the classic version of cpanminus \
internals and behavios. This is so that existing users of cpanm and API \
clients such as Carton, Carmel and App::cpm) can rely on the stable \
features and specific behaviors of cpanm. \
 \
This way Menlo can evolve and be refactored without the fear of breaking \
any downstream clients, including 'cpanm' itself."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9022"

RPM_NAME = "perl-Menlo-Legacy-1.9022-1.26.noarch.rpm"
RPM_HASH = "2ee396c569e75b801c69bc5aabbab3793ee130359e32bcf45d0358481e36142bb8b44f7bbe9785ff687a1ec81a99a0b8aa3baba0bbb3193b1e0f00a838a12eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo--CLI--Compat \
perl-Menlo--Legacy \
perl-Menlo-Legacy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Menlo \
perl-version"

inherit rpm
