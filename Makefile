generate:
	rm -rf shared/asn/
	mkdir -p shared/asn || true
	cd shared/asn/ && asn1c ../ISO-18013-5.asn1
	rm shared/asn/converter-sample.c
	rm shared/asn/Makefile.am.sample