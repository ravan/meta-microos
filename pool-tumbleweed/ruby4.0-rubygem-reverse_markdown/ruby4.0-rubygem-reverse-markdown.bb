SUMMARY = "Convert html code into markdown"
DESCRIPTION = "Map simple html back into markdown, e.g. if you want to import existing html \
data in your application."
LICENSE = "WTFPL"

PV = "3.0.0"

RPM_NAME = "ruby4.0-rubygem-reverse_markdown-3.0.0-1.11.aarch64.rpm"
RPM_HASH = "64809adbee5200b58803918a206a24640129c598b3cb2e78f0c1d6365d115bd25ddd1a632213002e1b2189b4dcf8056e06417830e5379093dd9274d758208ec7"

RPROVIDES:${PN} += "ruby4.0-rubygem-reverse-markdown \
rubygem-reverse-markdown \
rubygem-ruby-4.0.0-reverse-markdown \
rubygem-ruby-4.0.0-reverse-markdown-3 \
rubygem-ruby-4.0.0-reverse-markdown-3.0 \
rubygem-ruby-4.0.0-reverse-markdown-3.0.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
