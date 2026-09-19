SUMMARY = "Find and use installed modules in a (sub)category"
DESCRIPTION = "Module::Find lets you find and use modules in categories. This can be very \
useful for auto-detecting driver or plugin modules. You can differentiate \
between looking in the category itself or in all subcategories. \
 \
If you want Module::Find to search in a certain directory on your harddisk \
(such as the plugins directory of your software installation), make sure \
you modify '@INC' before you call the Module::Find functions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Module-Find-0.170.0-1.9.noarch.rpm"
RPM_HASH = "9978e218b9c7b2253a88289b45debe82d50c5c42cb62e0e9b93dc13d63abbd3acf711b73d92ccf11ea192f1f151975491b02dc42f0eed869cc0855b6a04626c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Find \
perl-Module-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
