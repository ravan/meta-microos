SUMMARY = "Install shared files"
DESCRIPTION = "File::ShareDir::Install allows you to install read-only data files from a \
distribution. It is a companion module to File::ShareDir, which allows you \
to locate these files after installation. \
 \
It is a port of Module::Install::Share to ExtUtils::MakeMaker with the \
improvement of only installing the files you want; '.svn', '.git' and other \
source-control junk will be ignored. \
 \
Please note that this module installs read-only data files; empty \
directories will be ignored."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-File-ShareDir-Install-0.140.0-1.7.noarch.rpm"
RPM_HASH = "65b1cc02014a4a98518ccc0dd677b31f217548a55e71357162ca3562c1c56bd08b2ca7c2c5e242f3bbb44a0409be0b7ea52b8bf101816da3d7567eecd1be85dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--Install \
perl-File-ShareDir-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
