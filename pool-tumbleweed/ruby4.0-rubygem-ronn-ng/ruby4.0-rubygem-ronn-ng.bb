SUMMARY = "Builds man pages from Markdown"
DESCRIPTION = "Ronn-NG builds manuals in Unix man page and HTML format from Markdown. Ronn-NG \
is a modern, maintained fork of the original Ronn."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "ruby4.0-rubygem-ronn-ng-0.10.1-1.12.aarch64.rpm"
RPM_HASH = "b9bdd055588f03c16d490a364865a9c530ccc5466dc206e129f8acaa3fbb6d93e4c143a57913de55fcadb82995058c762308033e354a1df9ab8462a8ca51fc62"

RPROVIDES:${PN} += "ruby4.0-rubygem-ronn-ng \
rubygem-ronn-ng \
rubygem-ruby-4.0.0-ronn-ng \
rubygem-ruby-4.0.0-ronn-ng-0 \
rubygem-ruby-4.0.0-ronn-ng-0.10 \
rubygem-ruby-4.0.0-ronn-ng-0.10.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-kramdown \
rubygem-ruby-4.0.0-kramdown-parser-gfm \
rubygem-ruby-4.0.0-mustache \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
