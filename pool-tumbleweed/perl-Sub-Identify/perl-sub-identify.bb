SUMMARY = "Retrieve names of code references"
DESCRIPTION = "'Sub::Identify' allows you to retrieve the real name of code references. \
 \
It provides six functions, all of them taking a code reference. \
 \
'sub_name' returns the name of the code reference passed as an argument (or \
'__ANON__' if it's an anonymous code reference), 'stash_name' returns its \
package, and 'sub_fullname' returns the concatenation of the two. \
 \
'get_code_info' returns a list of two elements, the package and the \
subroutine name (in case of you want both and are worried by the speed.) \
 \
In case of subroutine aliasing, those functions always return the original \
name. \
 \
'get_code_location' returns a two-element list containing the file name and \
the line number where the subroutine has been defined. \
 \
'is_sub_constant' returns a boolean value indicating whether the subroutine \
is a constant or not."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Sub-Identify-0.14-1.51.aarch64.rpm"
RPM_HASH = "afb292b7e0c262171138777ee709e28c583eef2b9ff2a7fff8c4f38d95fcfbc6fb36dab54401db7f93619de0ff9e69665391e68d2c941d46ce3d00b82ebf6702"

RPROVIDES:${PN} += "perl-Sub--Identify \
perl-Sub-Identify"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
