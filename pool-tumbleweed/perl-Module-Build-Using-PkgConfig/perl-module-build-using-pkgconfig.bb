SUMMARY = "Extend Module::Build to more easily use platform libraries provided by pkg-config"
DESCRIPTION = "This subclass of Module::Build provides some handy methods to assist the \
_Build.PL_ script of XS-based module distributions that make use of \
platform libraries managed by _pkg-config_. \
 \
As well as supporting libraries installed on a platform-wide basis and thus \
visible to _pkg-config_ itself, this subclass also assists with \
'Alien::'-based wrappers of these system libraries, allowing them to be \
dynamically installed at build time if the platform does not provide them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Module-Build-Using-PkgConfig-0.03-1.27.noarch.rpm"
RPM_HASH = "4fd545448ea14ecc530d7eaf0f47e51dfc095d97f271f47cfdeeb4a677e5d0bc2911ca24fce55b87b83f4060a06440d041476efd9daf82282a63f4b98d361b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Using--PkgConfig \
perl-Module-Build-Using-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--PkgConfig \
perl-Module--Build"

inherit rpm
