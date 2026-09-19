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

RPM_NAME = "python314-zope.configuration-7.1-1.2.noarch.rpm"
RPM_HASH = "806e3218507e21b1fea863a1f0f217ed9741ad34e704a7f8fa5276ef17b462b10004df7a75f5c6cd5159942d307b3d5bff15cbef7d6941fd8a8774b3806235d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.configuration \
python314-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python314-zope.i18nmessageid \
python314-zope.interface \
python314-zope.schema"

inherit rpm
