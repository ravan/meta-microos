SUMMARY = "Pretend certain modules are not installed"
DESCRIPTION = "Sometimes you need to test what happens when a given module is not \
installed. This module provides a way of temporarily hiding installed \
modules from perl's require mechanism. The Module::Mask object adds itself \
to @INC and blocks require calls to restricted modules. \
 \
Module::Mask will not affect modules already loaded at time of \
instantiation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Module-Mask-0.06-1.24.noarch.rpm"
RPM_HASH = "e4d239cc9ee4d84eeaa2f5943a57b1efb238181f2a83f316598036f1e6861cf3a6a144c90372120fccfc279f7f5d83152ba7d40a9ff104c75b498a86a984534e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Mask \
perl-Module-Mask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Util"

inherit rpm
