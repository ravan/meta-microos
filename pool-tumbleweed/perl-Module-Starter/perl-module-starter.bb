SUMMARY = "Simple starter kit for any module"
DESCRIPTION = "This is the core module for Module::Starter. If you're not looking to \
extend or alter the behavior of this module, you probably want to look at \
module-starter instead. \
 \
Module::Starter is used to create a skeletal CPAN distribution, including \
basic builder scripts, tests, documentation, and module code. This is done \
through just one method, 'create_distro'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.820.0"

RPM_NAME = "perl-Module-Starter-1.820.0-1.5.noarch.rpm"
RPM_HASH = "72569ead2ffe63011f20b772776ad40c226ea1fa521ee9611a1061c3ecc5e78e5c607fd292412f767d0d018426a333fbdf7cf7ed6be75a674ef4f39d3f4b9db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Starter \
perl-Module--Starter--App \
perl-Module--Starter--BuilderSet \
perl-Module--Starter--Plugin--Template \
perl-Module--Starter--Simple \
perl-Module-Starter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime \
perl-Software--License \
perl-Test--More \
perl-parent \
perl-version"

inherit rpm
