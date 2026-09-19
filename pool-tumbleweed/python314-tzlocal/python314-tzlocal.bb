SUMMARY = "Timezone information (tzinfo) object for the local timezone"
DESCRIPTION = "This Python module returns the IANA time zone name for your local time zone \
or a tzinfo object with the local timezone information, under Unix and \
Windows. \
 \
This module attempts to fix a glaring hole in the pytz and zoneinfo modules, \
that there is no way to get the local timezone information, unless you know \
the zoneinfo name, and under several Linux distros that's hard or impossible \
to figure out. \
 \
With tzlocal you only need to call get_localzone() and you will get a tzinfo \
object with the local time zone info. On some Unices you will still not get \
to know what the timezone name is, but you don't need that when you have the \
tzinfo file. However, if the timezone name is readily available it will be \
used."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "python314-tzlocal-5.4.4-1.1.noarch.rpm"
RPM_HASH = "57b2cf5b86de563d68dfae746f8e77e6e35910333db82195f66d785ade367d9d664a8a9ff184d0a60a6728d77ae0c4ba2160cf65ee08863926179f5b54c4abe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tzlocal \
python314-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python314-tzdata"

inherit rpm
