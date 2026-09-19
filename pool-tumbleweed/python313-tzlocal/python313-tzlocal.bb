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

RPM_NAME = "python313-tzlocal-5.4.4-1.1.noarch.rpm"
RPM_HASH = "c1b5313ab513fd56852d941fe37612ad1a93b600b19492a1404fe0a3055bc1a7c34dfe76868ebf4a081c3dee2ae74b6d6e5d95108b5133ba253009f694c27f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tzlocal \
python3.13dist-tzlocal \
python313-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python313-tzdata"

inherit rpm
