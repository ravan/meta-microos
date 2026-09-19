SUMMARY = "get the full path to a locally installed module"
DESCRIPTION = "This module provides a single function, 'module_path()', which takes a \
module name and finds the first directory in your '@INC' path where the \
module is installed locally. It returns the full path to that file, \
resolving any symlinks. It is portable and only depends on core modules. \
 \
It works by looking in all the directories in '@INC' for an appropriately \
named file: \
 \
I wrote this module because I couldn't find an alternative which dealt with \
the points listed above, and didn't pull in what seemed like too many \
dependencies to me. \
 \
The distribution for 'Module::Path' includes the 'mpath' script, which lets \
you get the path for a module from the command-line: \
 \
 % mpath Module::Path \
 \
The 'module_path()' function will also cope if the module name includes \
'.pm'; this means you can pass a partial path, such as used as the keys in \
'%INC': \
 \
  module_path('Test/More.pm') eq $INC{'Test/More.pm'} \
 \
The above is the basis for one of the tests."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.19"

RPM_NAME = "perl-Module-Path-0.19-1.42.noarch.rpm"
RPM_HASH = "6431c501d84e9a4de09c50d9baeced41c7c616a2272f8d5ad8957b613608bab10bad6372c5eb41f9e75cbf414d2ef04ecdeebb43810d2693f76484572e935bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Path \
perl-Module-Path"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
