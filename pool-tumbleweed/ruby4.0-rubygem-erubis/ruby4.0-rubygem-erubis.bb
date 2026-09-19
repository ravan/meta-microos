SUMMARY = "a fast and extensible eRuby implementation which supports"
DESCRIPTION = "Erubis is an implementation of eRuby and has the following features: \
* Very fast, almost three times faster than ERB and about 10% faster than \
eruby. \
* Multi-language support (Ruby/PHP/C/Java/Scheme/Perl/Javascript) \
* Auto escaping support \
* Auto trimming spaces around '<% %>' \
* Embedded pattern changeable (default '<% %>') \
* Enable to handle Processing Instructions (PI) as embedded pattern (ex. '<?rb \
... ?>') \
* Context object available and easy to combine eRuby template with YAML \
datafile \
* Print statement available \
* Easy to extend and customize in subclass \
* Ruby on Rails support."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "ruby4.0-rubygem-erubis-2.7.0-6.49.aarch64.rpm"
RPM_HASH = "11da7e9755a7c2fa952356dd48dc2f87df857b9ed13f7cb4ef58d3c1a6f6b5dbac4273db9fa7bed190545b1854b5fdf53e1dceba8579e1f44c4604c211bd2dd4"

RPROVIDES:${PN} += "ruby4.0-rubygem-erubis \
rubygem-erubis \
rubygem-ruby-4.0.0-erubis \
rubygem-ruby-4.0.0-erubis-2 \
rubygem-ruby-4.0.0-erubis-2.7 \
rubygem-ruby-4.0.0-erubis-2.7.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
