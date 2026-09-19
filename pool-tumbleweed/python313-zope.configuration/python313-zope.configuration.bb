SUMMARY = "Zope Configuration Markup Language (ZCML)"
DESCRIPTION = "The zope configuration system provides an extensible system for supporting \
various kinds of configurations. \
 \
It is based on the idea of configuration directives. Users of the configuration \
system provide configuration directives in some language that express \
configuration choices. The intent is that the language be pluggable. An XML \
language is provided by default."
LICENSE = "ZPL-2.1"

PV = "7.1"

RPM_NAME = "python313-zope.configuration-7.1-1.2.noarch.rpm"
RPM_HASH = "ee4fc37db0baea67cab8c210eab5e03add1f64fabc8c946c03112bca202065394ec18e35d8fcb6516c173f21e20e6a0149c57816239a2fadde685ef6834346cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.configuration \
python3.13dist-zope.configuration \
python313-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python313-zope.i18nmessageid \
python313-zope.interface \
python313-zope.schema"

inherit rpm
