SUMMARY = "Email composition and delivery framework (part of Rails)"
DESCRIPTION = "Email on Rails. Compose, deliver, and test emails using the familiar \
controller/view pattern. First-class support for multipart email and \
attachments."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actionmailer-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "4c8f79c55888b4b8b1c92fecb95120ed794d0ee453a864a6493c2fc0c54268351258cb8de045a67f0aa5cfba34b1ee40aed45f8e28258e0967423d246153c493"

RPROVIDES:${PN} += "ruby4.0-rubygem-actionmailer-8.0 \
rubygem-actionmailer \
rubygem-ruby-4.0.0-actionmailer \
rubygem-ruby-4.0.0-actionmailer-8 \
rubygem-ruby-4.0.0-actionmailer-8.0 \
rubygem-ruby-4.0.0-actionmailer-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-mail \
rubygem-ruby-4.0.0-rails-dom-testing-2"

inherit rpm
