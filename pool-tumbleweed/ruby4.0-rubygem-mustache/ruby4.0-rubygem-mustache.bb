SUMMARY = "Mustache is a framework-agnostic way to render logic-free views"
DESCRIPTION = "Inspired by ctemplate, Mustache is a framework-agnostic way to render \
logic-free views. \
As ctemplates says, 'It emphasizes separating logic from presentation: \
it is impossible to embed application logic in this template \
language. \
Think of Mustache as a replacement for your views. Instead of views \
consisting of ERB or HAML with random helpers and arbitrary logic, \
your views are broken into two parts: a Ruby class and an HTML \
template."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby4.0-rubygem-mustache-1.1.1-2.1.aarch64.rpm"
RPM_HASH = "cb955bf4a0afe43a4a251bdba13502ba415197904aabd4da5c90798cb70d5e6782c91ea7f7feb1f2387b1586ebd471c02e43e13f91fc79c5f4f6b0e63c346217"

RPROVIDES:${PN} += "ruby4.0-rubygem-mustache \
rubygem-mustache \
rubygem-ruby-4.0.0-mustache \
rubygem-ruby-4.0.0-mustache-1 \
rubygem-ruby-4.0.0-mustache-1.1 \
rubygem-ruby-4.0.0-mustache-1.1.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
