SUMMARY = "FileHandle which supports multi-byte unget"
DESCRIPTION = "FileHandle::Unget operates exactly the same as FileHandle, except that it \
provides a version of ungetc that allows you to unget more than one \
character. It also provides ungets to unget a string. \
 \
This module is useful if the filehandle refers to a stream for which you \
can't just 'seek()' backwards. Some operating systems support multi-byte \
'ungetc()', but this is not guaranteed. Use this module if you want a \
portable solution. In addition, on some operating systems, eof() will not \
be reset if you ungetc after having read to the end of the file. \
 \
NOTE: Using 'sysread()' with 'ungetc()' and other buffering functions is \
still a bad idea."
LICENSE = "GPL-2.0-or-later"

PV = "0.1634"

RPM_NAME = "perl-FileHandle-Unget-0.1634-1.32.noarch.rpm"
RPM_HASH = "6c611f40708a246beb6257e77e0dbf375df281bdcaf73681e5bd184a6400f008662ec45d65878ed16c50f457ca7a1d5010fc5cd4aa3bbdfaa362719bddc73cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FileHandle--Unget \
perl-FileHandle--Unget--Tie \
perl-FileHandle-Unget"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
