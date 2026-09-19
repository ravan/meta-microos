SUMMARY = "Locate directory of original perl script"
DESCRIPTION = "Locates the full path to the script bin directory to allow the use of paths \
relative to the bin directory. \
 \
This allows a user to setup a directory tree for some software with \
directories <root>/bin and <root>/lib and then the above example will allow \
the use of modules in the lib directory without knowing where the software \
tree is installed. \
 \
If perl is invoked using the *-e* option or the perl script is read from \
'STDIN' then FindBin sets both 'Bin()' and 'RealBin()' return values to the \
current directory."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.05"

RPM_NAME = "perl-FindBin-Real-1.05-14.42.noarch.rpm"
RPM_HASH = "2eaf4f35f86b408f7a7449998e17807d6d813f2359994fb2eba995b94fc5fe8019ef7f07343f13af325357966a25169bbc62a5b38504caf6d8f0ee47da5d80ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FindBin--Real \
perl-FindBin-Real"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
