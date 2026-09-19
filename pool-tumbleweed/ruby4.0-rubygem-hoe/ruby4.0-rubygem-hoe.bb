SUMMARY = "Hoe is a rake/rubygems helper for project Rakefiles"
DESCRIPTION = "Hoe is a rake/rubygems helper for project Rakefiles. It helps you \
manage, maintain, and release your project and includes a dynamic \
plug-in system allowing for easy extensibility. Hoe ships with \
plug-ins for all your usual project tasks including rdoc generation, \
testing, packaging, deployment, and announcement. \
See class rdoc for help. Hint: `ri Hoe` or any of the plugins listed \
below. \
For extra goodness, see: https://docs.seattlerb.org/hoe/Hoe.pdf \
== Features/Problems: \
* Includes a dynamic plug-in system allowing for easy extensibility. \
* Auto-intuits changes, description, summary, and version. \
* Uses a manifest for safe and secure deployment. \
* Provides 'sow' for quick project directory creation. \
* Sow uses a simple ERB templating system allowing you to capture your \
project patterns."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "ruby4.0-rubygem-hoe-4.7.1-1.2.aarch64.rpm"
RPM_HASH = "a23d626d63832ca881936babf4b9bd3a7c6c500b7f2f6d6b2e80b5768aa3e825ac7c974871413e00e3611a7d1bbee92e3f115bf71d97822128d8784b756b69e1"

RPROVIDES:${PN} += "ruby4.0-rubygem-hoe \
rubygem-hoe \
rubygem-ruby-4.0.0-hoe \
rubygem-ruby-4.0.0-hoe-4 \
rubygem-ruby-4.0.0-hoe-4.7 \
rubygem-ruby-4.0.0-hoe-4.7.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rake-13"

inherit rpm
