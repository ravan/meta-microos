SUMMARY = "Dom and Selector assertions for Rails applications"
DESCRIPTION = "This gem can compare doms and assert certain elements exists in doms using \
Nokogiri."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby4.0-rubygem-rails-dom-testing-2.2.0-1.15.aarch64.rpm"
RPM_HASH = "2776ff945a187ffbd56aa66e4b86525c0aa0f2d70da55f6d268d350b062c0fc8d3a4743f48042404d55779bd347c81da318d28735115c8900d3a6b29c4a4bb75"

RPROVIDES:${PN} += "ruby4.0-rubygem-rails-dom-testing \
rubygem-rails-dom-testing \
rubygem-ruby-4.0.0-rails-dom-testing \
rubygem-ruby-4.0.0-rails-dom-testing-2 \
rubygem-ruby-4.0.0-rails-dom-testing-2.2 \
rubygem-ruby-4.0.0-rails-dom-testing-2.2.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-minitest \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
