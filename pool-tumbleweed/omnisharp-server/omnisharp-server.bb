SUMMARY = "HTTP wrapper around NRefactory allowing C# editor plugins"
DESCRIPTION = "HTTP wrapper around NRefactory allowing C# editor plugins to be written for any \
editor in any language. \
 \
This is the server component for the Vim OmniSharp plugin, YouCompleteMe, \
Sublime Text 2, Sublime Text 3, Emacs OmniSharp plugin and Atom plugin"
LICENSE = "MIT"

PV = "0+git.1440884867.e190291"

RPM_NAME = "omnisharp-server-0+git.1440884867.e190291-1.34.noarch.rpm"
RPM_HASH = "416fb02e9d4cbbfa0926e92e77357fed3d1eb515276523af51e3f7a463fb6f1f76005b3ed7a13620700f1ba84d545bc99d1e1f39d5318d27152ca447f6665d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "omnisharp-server"

RDEPENDS:${PN} += "mono-core"

inherit rpm
